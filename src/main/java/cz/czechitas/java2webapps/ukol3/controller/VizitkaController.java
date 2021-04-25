package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

    //  field vizitky
    private final List<Vizitka> vizitky;

    //  konstruktor
    public VizitkaController() {
        vizitky = Arrays.asList(
                new Vizitka("Dana Holubová", "Masarykova univerzita", "Žerotínovo náměstí 617/9",
                        "Brno", "60200", "danmich@email.cz", "+420 124587", "www.botanickafotogalerie.cz"),
                new Vizitka("Nikola Holubová", "IPC", "Šumavská 416/15",
                        "Brno","60200",null, "+420 800123456", "https://www.autocont-ipc.cz/"),
                new Vizitka("Monika Ptáčníková", "Czechitas z. s.", "Václavské náměstí 837/11",
                        "Praha 1", "11000", "monika@czechitas.cs", "+420 800123456", null),
                new Vizitka("Mirka Zatloukalová", "Czechitas z. s.", "Václavské náměstí 837/11",
                        "Praha 1", "11000", "mirka@czechitas.cs", null, "www.czechitas.cz")
        );
    }

    @GetMapping("/")
    public ModelAndView seznam() {
ModelAndView result = new ModelAndView("seznam");
result.addObject("vizitky", vizitky);
        return result;
    }

    @GetMapping("/detail")
    public ModelAndView detail(int id) {
        ModelAndView result = new ModelAndView("detail");
        result.addObject("vizitka", vizitky.get(id));
        return result;
    }
}
