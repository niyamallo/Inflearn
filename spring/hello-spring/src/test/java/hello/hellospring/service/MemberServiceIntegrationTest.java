package hello.hellospring.service;
// 아래의 코드는 스프링 통합테스트 코드.
// 보통은 단위테스트로 하는 것이 좋을 때가 많다. 시간 이득.
// 단위 테스트의 설계를 잘하자.
import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRespository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest //스프링 컨테이너와 테스트를 함께 실행한다.
@Transactional //이걸 통해 BeforeEach, AfterEach로 초기화 할 필요x
    //이렇게 하면 DB에 데이터가 남지 않으므로 다음 테스트에 영향을 주지x
    //각 테스트마다 테스트 시작 전에 트랜잭션을 시작하고, 테스트 종료 후 롤백
class MemberServiceIntegrationTest {

    @Autowired MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    //@Commit //DB에 저장되는지 확인하기 위해 잠시 사용
    void 회원가입() {
        //given
        Member member = new Member();
        member.setName("spring1");

        //when
        Long saveId = memberService.join(member);

        //then
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    void 중복_회원_예외() {
        //given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        //when
        memberService.join(member1);
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));

        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

        //then
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}