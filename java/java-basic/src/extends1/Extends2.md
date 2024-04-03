# 오버로딩(Overloading)과 오버라이딩(Overriding)
    - 메서드 오버로딩: 메서드 이름이 같고 파라미터가 다른 메서드를 여러개 정의하는 것. 오버로딩은 과하게 물건을 담았다는 뜻이다.
                    따라서 같은 이름의 메서드를 여러개 정의했다고 이해하면 됨.
    - 메서드 오버라이딩: 하위 클래스에서 상위 클래스의 메서드를 재정의하는 과정. 따라서 상속관계에서 사용한다. 재정의 라고도 한다.

# 메서드 오버라이딩 조건
    - 메서드 이름: 메서드 이름이 같아야 한다.
    - 메서드 매개변수(파라미터): 파라미터 타입, 순서, 개수가 같아야 한다.
    - 반환 타입: 반환 타입이 같아야 한다. 단, 반환 타입이 하위 클래스 타입일 수 있다.
    - 접근 제어자: 오버라이딩 메서드의 접근 제어자는 상위 클래스의 메서드보다 더 제한적이어서는 안된다.
    - 예외: 오버라이딩 메서드는 상위 클래스의 메서드보다 더 많은 예외를 throws로 선언할 수 없다.
    - static, final, private 키워드가 붙은 메서드는 오버라이딩 될 수 없다.
        - static: 클래스 레벨에서 작동하므로 인스턴스 레벨에서 사용하는 오버라이딩이 의미가 없다.
        - final: 재정의를 금지한다.
        - private: 해당 클레스에서만 접근 가능하기 때문에 하위 클래스에서 보이지 않음. 따라서 오버라이딩 할 수 없다.
    - 생성자는 오버라이딩 할 수 없다.