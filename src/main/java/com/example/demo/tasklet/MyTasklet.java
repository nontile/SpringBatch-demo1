package com.example.demo.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyTasklet implements Tasklet {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MyTasklet.class);

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        log.debug("my task contribution", contribution);
        log.debug("my task chunkContext", chunkContext);
        return RepeatStatus.FINISHED;
    }
    
}
