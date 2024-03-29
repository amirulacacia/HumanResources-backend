package campolina.hrgroup.hrapp.controller.job;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import campolina.hrgroup.hrapp.model.job.Interview;
import campolina.hrgroup.hrapp.service.job.InterviewService;

@RestController
@RequestMapping("/interview")
public class InterviewController {

    @Autowired
    private InterviewService interviewService;

    @PostMapping("/applicant/{applicantId}")
    public Interview createInterview(@RequestBody Interview interview, @PathVariable Long applicantId) {
        return interviewService.createInterview(interview, applicantId);
    }

    @GetMapping("/{interviewId}")
    public Interview getInterviewById(@PathVariable Long interviewId) {
        return interviewService.getInterviewById(interviewId);
    }

    @GetMapping
    public List<Interview> getAllInterviews() {
        return interviewService.getAllInterviews();
    }

    @PutMapping("/{interviewId}")
    public Interview updateInterview(@RequestBody Interview interview,
            @PathVariable Long interviewId) {
        return interviewService.updateInterview(interview, interviewId);
    }

    @DeleteMapping("/{interviewId}")
    public String deleteInterview(@PathVariable Long interviewId) {
        return interviewService.deleteInterview(interviewId);
    }
}
