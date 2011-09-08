package br.com.wbotelhos.spring.batch.task;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class HelloWorldTasklet implements Tasklet {

	public RepeatStatus execute(StepContribution step, ChunkContext chunck) throws Exception {
		System.out.println("\n\n Spring Batch Works! \n\n");

		return RepeatStatus.FINISHED;
	}

}