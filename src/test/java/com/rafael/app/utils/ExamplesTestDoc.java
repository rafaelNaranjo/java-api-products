package com.rafael.app.utils;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

//@ExtendWith(MockitoExtension.class)
public class ExamplesTestDoc {
    /*@Test
    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    @DisabledOnOs({OS.MAC})
    @EnabledOnJre(JRE.JAVA_11)
    @EnabledIfSystemProperty(named = "java.version", matches = "11")
    @EnabledIfEnvironmentVariable(named = "", matches = "")
    void testJunit5SomeUtilsTags() throws Exception {

    }

    @Nested
    @DisplayName("Product API specific topics")
    class ProductControllerSpecificTest {

        @Test
        void testSomeScenery() throws Exception {

        }
        @DisplayName("Product API specific")
        @RepeatedTest(value = 5, name = "{displayName} - ProductControllerSpecific {currentRepetition} de {totalRepetitions}")
        void testSomeScenery(RepetitionInfo info) throws Exception {

        }
        @Tag("") identification of test by tag
        @DisplayName("any")
        @ParameterizedTest(name = "{index} {0} - {argumentsWithNames}}")
        @ValueSource
        @CsvFileSource(resources = "", numLinesToSkip = 1)
        @EnumSource(value = Month.class, names = {"month", ""})
        @MethodSource("methodToProduceData")
        void parameterizedTest() throws Exception {

        }

        private TestInfo testInfo;
        private TestReporter testReporter;
        @BeforeEach
        void setup(TestInfo testInfo, TestReporter testReporter) throws Exception {
            MockitoAnnotations.openMocks(this);
            this.testInfo = testInfo;
            this.testReporter = testReporter;
        }
        @Test
        void someTestScenery(TestInfo testInfo, TestReporter testReporter) throws Exception {
            this.testInfo = testInfo;
            this.testReporter = testReporter;
        }

        @Test
        @Timeout(5)
        @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
        void timeoutSceneryTest() throws Exception {
            AssertTimeout(Duration.ofSeconds(4), () -> {
                System.out.println();
            });
        }

        @Test
        void catchError() throws Exception {
            when(anyMethod.method()).thenThrows(IllegalArgumentException.class);
            Exception exception = assertThrows(IllegalArgumentException.class, ()=>{
                methodToExecuteException();
            });

            assertEquals(IllegalArgumentException.class, exception.getClass());
        }

        @Captor
        ArgumentCaptor<Long> captor;

        @Test
        void executeTestWithExactArgumentsInMethod(){
            when(anyMethod.methd()).thenReturn(Collections.emptyList());
            service.execute(anyLong());
            verify(anyMethod).method(argThat(arg -> arg != null && arg >= 5L))
            //argument strict not null and mayor to 5.
            ArgumentCapture<Long> captor = ArgumentCapture.forClass(Long.class);
            verify(anyMethod).method(captor.capture());
            //Capture value use in methods
        }

        @Test
        void doThrow(){
            //Fire exception when method void execute;
            doThrow(IllegalArgumentException.class).when(class).method(any());
            assertThrows(IllegalArgumentException.class, () ->{
                instance.method(any());
            });
        }

        @Test
        void doThrow(){
            when(anyMethod.methd()).thenReturn(Collections.emptyList());

            doAnswer(invocation -> {
                long id = invocation.getArgument(0);
                return
            }),when(instanceMock).method();
        }

        @Test
        void doCallRealMethod(){
            // call real method of class, this mock class need have a method implementation, an error will occur if class is interface or abstract class.
            doCallRealMethod().when(instanceMock).method(any());
        }

        @Test
        void testSpy(){
            Class class = spy(ClassImplementation.class);
            doReturn(data).when(instanceClassImplementation).method(any());
        }

        @Test
        void testOrderMethod(){
            when(instanceClass.method()).thenReturn();
            instanceClass.method(1l)
            instanceClass.method(2l)
            InOrder inOrder = inOrder(otherInstanceCLass,instanceClass);
            inOrder.verify(otherInstanceCLass).method();
            inOrder.verify(instaceClass).method(1l);
            inOrder.verify(otherInstanceCLass).method();
            inOrder.verify(instaceClass).method(2l);

        }

        @Test
        void testOrderMethod(){

            verify(instanceClass, times(2l)).method();
            verify(instanceClass, atLeast(1)).method(1l);
            verify(instanceClass, atLeastOnce()).method();
            verify(instanceClass, atMost(1)).method(2l);
            verify(instanceClass, atMostOne()).method(2l);
            verify(instanceClass, atMostOne()).method(2l);
            verify(instanceClass, never()).method(2l);
            verifyNoInteractions(instanceMockClass);

        }

    }*/
}
