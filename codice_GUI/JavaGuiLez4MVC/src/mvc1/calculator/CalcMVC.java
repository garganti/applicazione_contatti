package mvc1.calculator;
// structure/calc-mvc/CalcMVC.java -- Calculator in MVC pattern.
// Fred Swartz -- December 2004

public class CalcMVC {
    //... Create model, view, and controller.  They are
    //    created once here and passed to the parts that
    //    need them so there is only one copy of each.
    public static void main(String[] args) {
        
        CalcModel      model      = new CalcModel();
        CalcView       view       = new CalcView(model);
        new CalcController(model, view);        
        view.setVisible(true);
    }
}
