package hello.advanced.trace.hellotrace.logtrace;

import hello.advanced.trace.TraceStatus;
import hello.advanced.trace.logtrace.FiledLogTrace;
import org.junit.jupiter.api.Test;

class FiledLogTraceTest {
    FiledLogTrace trace = new FiledLogTrace();

    @Test
    void begin_end_level2(){
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.begin("hello2");
        trace.end(status2);
        trace.end(status1);
    }

    @Test
    void begin_exception_level2(){
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.begin("hello2");
        trace.exception(status2,new IllegalStateException());
        trace.exception(status1, new IllegalStateException());
    }


}