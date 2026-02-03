import javax.swing.JOptionPane;

public class ReportCardGUI {
    public static void main(String[] args) {
        
        
        String name = JOptionPane.showInputDialog("Enter Student Name:");
        String regNo = JOptionPane.showInputDialog("Enter Register Number:");
        
        String[] subjects = {"Mathematics", "Java Programming", "Data Science", "Machine Learning", "Operating Systems"};
        int[] marks = new int[subjects.length];
        int total = 0;

        for (int i = 0; i < subjects.length; i++) {
            String input = JOptionPane.showInputDialog("Enter marks for " + subjects[i] + ":");
            marks[i] = Integer.parseInt(input);  
            total += marks[i];
        }

        
        double average = (double) total / subjects.length;
        String grade = (average >= 90) ? "S" : (average >= 80) ? "A" : (average >= 70) ? "B" : "C";

        
        StringBuilder report = new StringBuilder();
        report.append("           ACADEMIC REPORT CARD\n");
        report.append("******************************************\n");
        report.append("Name: ").append(name.toUpperCase()).append("\n");
        report.append("Reg No: ").append(regNo).append("\n");
        report.append("------------------------------------------\n");
        
        for (int i = 0; i < subjects.length; i++) {
            report.append(String.format("%-20s : %d\n", subjects[i], marks[i]));
        }
        
        report.append("------------------------------------------\n");
        report.append("Total Marks: ").append(total).append("\n");
        report.append("Average: ").append(String.format("%.2f", average)).append("%\n");
        report.append("Final Grade: ").append(grade).append("\n");
        report.append("******************************************");

        
        JOptionPane.showMessageDialog(null, report.toString(), "Student Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
