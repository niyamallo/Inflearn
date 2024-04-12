package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//인터페이스가 인터페이스를 받을 때는 extends 사용
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    
    //findBy뒤에 Name을 붙임으로써 아래의 JPQL문이 만들어짐.
    //JPQL select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
    //findByNameAndId(String name, Long id); 이런식으로 사용 가능
    //인터페이스 이름만으로 개발 끝내기!
}
