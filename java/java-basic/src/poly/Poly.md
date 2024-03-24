# 다형성
    - 한 객체가 여러 타입의 객체로 취급될 수 있는 능력

# 다형적 참조
    - 자바에서 부모 타입은 자신은 물론, 자신을 기준으로 모든 자식 타입을 참조할 수 있다.
    Parent poly = new Parent();
    Parent poly = new Child();
    parent poly = new Grandson();

# 캐스팅
    - 업캐스팅(upcasting): 부모 타입으로 변경(생략해서 자동으로 가능)
    - 다운캐스팅(downcasting): 자식 타입으로 변경

# instanceof
    - 어떤 인스턴스를 참조하고 있는지 인스턴스의 타입을 확인하는 방법
    참고: instanceof 키워드 오른쪽 대상의 자식 타입을 왼쪽에서 참조하는 경우에도 true를 반환.
    new Child() instanceof Parent //true
    new Parent() instanceof Child //false

# 메서드 오버라이딩
    - 메서드 오버라이딩에서 꼭! 기억해야 할 점: 오버라이딩 된 메서드가 항상 우선권을 가진다.
    (자식 밑에 손자가 있다면 손자가 우선권. 가장 하위 자식의 오버리이딩 된 메서드가 우선권!!)
    참고: 멤버 변수는 오버라이딩 되지 않는다. 부모, 자식 모두 같은 이름의 변수를 각각 가질 수 있다.