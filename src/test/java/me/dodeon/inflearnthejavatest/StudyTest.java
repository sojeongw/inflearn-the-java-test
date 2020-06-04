package me.dodeon.inflearnthejavatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

// 테스트 전체에 적용된다.
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    // JUnit 5부터는 public을 붙이지 않아도 된다. 리플렉션을 사용해서 private 한 메서드에도 접근 가능하므로 굳이 public일 필요가 없기 때문이다.
    @Test
    // 해당 테스트에만 적용된다. 이모지도 가능하다.
    @DisplayName("스터디 만들기")
    void a() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("a");
    }

    @Test
    @Disabled
    void b() {
        System.out.println("b");
    }

    // 테스트 클래스 안에 있는 모든 테스트가 실행될 때 딱 한 번만 호출된다.
    // private이 아니면서 static이고 리턴값이 없는 메서드만 사용해야 한다. 메서드 이름은 상관없다.
    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    // 각각의 테스트를 실행하기 이전, 이후에 실행된다.
    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }

}