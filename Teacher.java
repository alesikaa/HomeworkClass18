package HomeworkClass18;

public class Teacher {
    String name;
    int age;
    String subject;

    // Behaviors
    public void teach() {
        System.out.println(this.name + " is teaching " + this.subject);
    }

    protected void grade() {
        System.out.println(this.name + " is grading papers");
    }

    public void attendMeeting() {
        System.out.println(this.name + " is attending a meeting");
    }

    public void planLesson() {
        System.out.println(this.name + " is planning a lesson");
    }
}

class MathTeacher extends Teacher {
    // Features
    String[] mathSubjects;

    // Behaviors
    public void teachMath() {
        System.out.println(this.name + " is teaching math");
    }

    public void solveMathProblem() {
        System.out.println(this.name + " is solving a math problem");
    }
}

class ChemistryTeacher extends Teacher {
    // Features
    String[] chemicals;

    // Behaviors
    public void teachChemistry() {
        System.out.println(this.name + " is teaching chemistry");
    }

    public void conductExperiment() {
        System.out.println(this.name + " is conducting a chemistry experiment");
    }
}

class PianoTeacher extends Teacher {
    // Features
    String[] pianoStyles;

    // Behaviors
    public void teachPiano() {
        System.out.println(this.name + " is teaching piano");
    }

    public void playPiano() {
        System.out.println(this.name + " is playing the piano");
    }
}
