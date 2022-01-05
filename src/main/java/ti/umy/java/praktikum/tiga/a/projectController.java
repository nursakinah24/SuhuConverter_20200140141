/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.java.praktikum.tiga.a;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Asus
 */

@Controller
public class projectController {
    @RequestMapping ("/suhu")
    public String projectController(HttpServletRequest data, Model proses) 
    {
        prosesData pro = new prosesData();
    
        String inputSuhu = data.getParameter("var_inputsuhu");
        
        Double nSuhu = pro.getSuhuC(inputSuhu);
        Double nFahrenheit = pro.getSuhuF(nSuhu);
        Double nReamur = pro.getSuhuR(nSuhu);
        Double nKelvin = pro.getSuhuK(nSuhu);
        
        proses.addAttribute("Celcius", inputSuhu);
        proses.addAttribute("Fahrenheit", nFahrenheit);
        proses.addAttribute("Reamur", nReamur);
        proses.addAttribute("Kelvin", nKelvin);
        
    return "viewSuhu";
}
}