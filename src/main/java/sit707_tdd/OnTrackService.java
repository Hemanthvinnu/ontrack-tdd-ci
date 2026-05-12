package sit707_tdd;

import java.util.HashMap;
import java.util.Map;

public class OnTrackService {

	private Map<String, String> taskStatuses = new HashMap<String, String>();

	public OnTrackService() {

		taskStatuses.put("224870842-7.1P", "PASSED");
		taskStatuses.put("224870842-8.1P", "SUBMITTED");
		taskStatuses.put("224870842-4.2C", "NEEDS_RESUBMISSION");
	}

	public String checkTaskStatus(String studentId, String taskId) {

		if (studentId == null || studentId.trim().isEmpty()) {
			return "INVALID_STUDENT_ID";
		}

		if (taskId == null || taskId.trim().isEmpty()) {
			return "INVALID_TASK_ID";
		}

		String key = studentId + "-" + taskId;

		if (!taskStatuses.containsKey(key)) {
			return "NOT_SUBMITTED";
		}

		return taskStatuses.get(key);
	}
}