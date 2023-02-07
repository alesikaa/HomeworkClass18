package HomeworkClass18;

public class School {
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.name = "Mr. Smith";
        mathTeacher.age = 45;
        mathTeacher.subject = "Math";
        mathTeacher.mathSubjects = new String[]{"Algebra", "Calculus"};
        mathTeacher.teach();
        mathTeacher.teachMath();
        mathTeacher.solveMathProblem();

        ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
        chemistryTeacher.name = "Ms. Johnson";
        chemistryTeacher.age = 35;
        chemistryTeacher.subject = "Chemistry";
        chemistryTeacher.chemicals = new String[]{"Hydrogen", "Oxygen"};
        chemistryTeacher.teach();
        chemistryTeacher.teachChemistry();
        chemistryTeacher.conductExperiment();

        PianoTeacher pianoTeacher = new PianoTeacher();
        pianoTeacher.name = "Mrs. Brown";
        pianoTeacher.age = 30;
        pianoTeacher.subject = "Piano";
        pianoTeacher.pianoStyles = new String[]{"Classical", "Jazz"};
        pianoTeacher.teach();
        pianoTeacher.teachPiano();
        pianoTeacher.playPiano();
    }
}

