package mai.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements pocket{
    private List<pocket> components = new ArrayList<>();

    public void addComponent(pocket component){
        components.add(component);
    }

    public void deleteComponent (pocket component){
        components.remove(component);
    }

    public void review() {
     for(pocket component: components){
         component.review();
     }
    }
}
