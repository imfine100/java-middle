package poly.basic;

// java 16 pattern matching insteadof
public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) { // 다운캐스팅 보장되는 경우 변수선언해서 사용 가능
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
