class Course {
    protected String courseName;
    protected int courseDuration;

    public Course(String courseName, int courseDuration) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }

    public void displatCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + courseDuration);
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int courseDuration, String platform, boolean isRecorded) {
        super(courseName, courseDuration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    @Override
    public void displatCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + courseDuration);
        System.out.println("Course Platform: " + platform);
        System.out.println("Course id recorded ? " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    protected int fee;
    protected int discount;
    public PaidOnlineCourse(String courseName, int courseDuration, String platform, boolean isRecorded, int fee, int discount) {
        super(courseName, courseDuration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    @Override
    public void displatCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + courseDuration);
        System.out.println("Course Platform: " + platform);
        System.out.println("Course id recorded ? " + isRecorded);
        System.out.println("Course Fee: " + fee);
        System.out.println("Discount: " + discount);
    }
}

public class EducationalCourse {
    public static void main(String[] args) {
        Course course = new Course("Frontend Dev", 10);
        OnlineCourse onlineCourse = new OnlineCourse("Frontend Dev", 10, "SNA E-PORTAL", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Frontend Dev", 10, "SNA E-PORTAL", true, 10000, 10);

        course.displatCourseDetails();
        onlineCourse.displatCourseDetails();
        paidOnlineCourse.displatCourseDetails();
    }
}
