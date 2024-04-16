package jpabook.jpashop.service;

import jakarta.persistence.EntityManager;
import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest //Spring 컨터이너 안에서 돌리기 위해서
@Transactional
class MemberServiceTest {

    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;
    @Autowired EntityManager em;

    @Test
    //@Rollback(false)
    /*
    persist를 한다고 insert가 나가는 것이 아니다.
    트랜잭션이 끝날 때 commit을 하고 insert문이 보내지는데,
    Transactional은 트랜잭션이 끝날 때 commit을 하지 않고 rollback을 하기 떄문에 false 처리해야
    insert문이 보내지는 것과 DB에 저장되는 것을 확인해 볼 수 있다.
     */
    public void 회원가입() throws Exception {
        //given
        Member member = new Member();
        member.setName("kim");

        //when
        Long savedId = memberService.join(member);

        //then
        em.flush();
        //flush()를 사용해 영속성 컨택스트에 member 객체를 넣는 방식으로
        //DB에 반영되게 할 수 있다. 이 때는 DB에 반영하기 위해 insert문이 보내짐.
        //단, 이 경우 Transactional에 의해 rollback은 되게 때문에
        //DB에서 직접 확인하고 싶다면 @Rollback(false)를 사용하자.
        assertEquals(member, memberRepository.findOne(savedId));
    }

    @Test
    public void 중복_회원_예외() throws Exception {
        //given
        Member member1 = new Member();
        member1.setName("kim");

        Member member2 = new Member();
        member2.setName("kim");

        //when

        memberService.join(member1);
        try {
            memberService.join(member2);
        } catch (IllegalStateException e) {
            return;
        }
        /*
        이렇게 해도 되지만, 코드가 지저분해 보이니까 expected 사용
        단, JUnit4에서는 되는데 확인해보니 JUnit5에서는 안되는듯 함.
        @Test(expected = IllegalStateException.class)
        ...
        memberService.join(member1);
        memberService.join(member2);
         */

        //then
        fail("예외가 발생해야 합니다.");
    }
}