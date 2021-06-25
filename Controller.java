package sample;

public class Controller {
    private Student model;
    private View view;

    public Controller(Student model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public void setLesson(String lesson){
        model.setLesson(lesson);
    }
    public String getLesson(){
        return model.getLesson();
    }
    public void updateView(){
        view.printStudentInfo(model.getName(), model.getLesson());
    }
}
