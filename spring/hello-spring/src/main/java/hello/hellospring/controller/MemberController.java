package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller // 스프링은 컨테이너에 빈을 등록할 때 싱글톤으로 등록
//유일하게 하나만 등록해서 공유한다. 따라서 같은 스프링 빈이면 모두 같은 인스턴스다.
public class MemberController {

    private final MemberService memberService;

    @Autowired //연결시키려면 MemberService 찾아가서 클래스에 @Service 추가, 메서드에 @Autowired 추가
    //repository에도 @Repository 추가
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());

        System.out.println("member = " + member.getName());

        memberService.join(member);

        return "redirect:/"; //회원가입 후 홈 화면으로 보내는 법
    }

    @GetMapping("/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
}
