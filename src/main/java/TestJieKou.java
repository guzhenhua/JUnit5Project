import org.junit.Test;

public class TestJieKou {

    @Test
    public void testMessage() {
        jiekou jiekou = message -> System.out.printf("name"+message);
        jiekou.sendMessage("zhangsan");
    }

    @Test
    public void testMessage1() {
        jiekou1 jiekou = () -> System.out.printf("name");
        jiekou.sendMessage();
    }
}
