package tacos;

import java.util.List;
import lombok.Data;
import tacos.Ingredient;

@Data
public class Taco {
    
    private String name;
    
    private List<Ingredient> ingredients;
}
