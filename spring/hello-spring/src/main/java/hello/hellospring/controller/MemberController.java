package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // 스프링은 컨테이너에 빈을 등록할 때 싱글톤으로 등록
//유일하게 하나만 등록해서 공유한다. 따라서 같은 스프링 빈이면 모두 같은 인스턴스다.
public class MemberController {

    private final MemberService memberService;

    @Autowired //연결시키려면 MemberService 찾아가서 클래스에 @Service 추가, 메서드에 @Autowired 추가
    //repository에도 @Repository 추가
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
