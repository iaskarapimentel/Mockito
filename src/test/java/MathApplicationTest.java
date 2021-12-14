

import main.java.CalculatorService;
import main.java.MathApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.internal.stubbing.answers.AnswersWithDelay;
import org.mockito.internal.stubbing.answers.Returns;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MathApplicationTest {

    @InjectMocks
    //TODO

    @Mock
    //TODO


    @Captor
    //TODO

    @Test
    @DisplayName("Use of When()  and thenReturn()")
    public void testMathApplicationUsingWhen() {
        //add the expectations of calc service calls
        //TODO
    }

    @Test
    @DisplayName("Verify method calls")
    public void testMathApplicationUsingVerify() {

        //TODO

        //verify calc service calls made for the above calls
        //TODO

    }

    @Test
    @DisplayName("No' of method invocations/calls")
    public void testVerifyNoOfMethodCalls() {

        //TODO

        //verify calc service calls made for the above calls
        //TODO

    }

    @Test
    @DisplayName("No' of method invocations/calls - 2")
    public void testVerifyNoOfMethodCalls2() {

        //TODO

        //verify calc service calls made for the above calls
        //TODO

    }

    @Test
    @DisplayName("Exception Handling")
    public void verify_ExceptionHandling() {

        //add the expected exceptions thrown for the below method calls
        //TODO
    }


    @Test
    @DisplayName("Verify Method call sequence/order")
    public void verify_OrderOfMethodExecution() {

        //TODO

        //Verify Method call execution order
        //TODO
    }

    @Test
    @DisplayName("Verify TimeOut")
    public void verify_TimeOut() {

        //TODO

        //Verify timeout above calls
        //TODO
    }


    @Test
    @DisplayName("Verify with Argument Capture")
    public void verify_ArgumentCaptureForAdd() {

        //TODO
    }

    @Test
    @DisplayName("Verify with Argument Capture For Subtract")
    public void verify_ArgumentCaptureForSubtract() {

        //TODO
    }

    @Test
    @DisplayName("Verify with Dynamic Responses")
    public void verify_dynamicResponses() {

        //Implement Answer
        Answer answer = new Answer() {
            @Override
            public Object answer(InvocationOnMock invocationOnMock) throws Throwable {
                String methodName = invocationOnMock.getMethod().getName();
                switch (methodName) {
                    case "add":
                        return 500.0;
                    case "subtract":
                        return 200.0;
                    case "multiply":
                        return 100.0;
                    case "divide":
                        return 25.0;
                }
                return 0;
            }
        };
        //TODO

    }
}