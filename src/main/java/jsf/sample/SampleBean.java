package jsf.sample;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class SampleBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String val;

    public String getVal() {
        return val;
    }
    public void setVal(String val) {
        this.val = val;
    }
}