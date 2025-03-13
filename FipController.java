import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fip")
public class FipController {

    @Autowired
    private FipService fipService; // Corrigido o nome da variável

    @GetMapping
    public String getFipData() {
        return fipService.getFipData();
    }
}
