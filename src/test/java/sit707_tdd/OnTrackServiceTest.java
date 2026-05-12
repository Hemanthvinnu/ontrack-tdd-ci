package sit707_tdd;

import org.junit.Assert;
import org.junit.Test;

public class OnTrackServiceTest {

	@Test
	public void testInvalidStudentId() {

		OnTrackService service = new OnTrackService();

		Assert.assertEquals(
				"INVALID_STUDENT_ID",
				service.checkTaskStatus("", "7.1P")
		);
	}

	@Test
	public void testInvalidTaskId() {

		OnTrackService service = new OnTrackService();

		Assert.assertEquals(
				"INVALID_TASK_ID",
				service.checkTaskStatus("224870842", "")
		);
	}

	@Test
	public void testTaskNotSubmitted() {

		OnTrackService service = new OnTrackService();

		Assert.assertEquals(
				"NOT_SUBMITTED",
				service.checkTaskStatus("224870842", "9.1P")
		);
	}

	@Test
	public void testTaskPassed() {

		OnTrackService service = new OnTrackService();

		Assert.assertEquals(
				"PASSED",
				service.checkTaskStatus("224870842", "7.1P")
		);
	}

	@Test
	public void testTaskSubmitted() {

		OnTrackService service = new OnTrackService();

		Assert.assertEquals(
				"SUBMITTED",
				service.checkTaskStatus("224870842", "8.1P")
		);
	}

	@Test
	public void testTaskNeedsResubmission() {

		OnTrackService service = new OnTrackService();

		Assert.assertEquals(
				"NEEDS_RESUBMISSION",
				service.checkTaskStatus("224870842", "4.2C")
		);
	}
}