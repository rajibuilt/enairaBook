package com.rajibuilt.codeBook;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StatesController {

    @RequestMapping(value = "states", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<States> stateList() {
        States akwa_ibom        = new States    ("SS", "AKWA-IBOM");
        States anambra          = new States    ("SE", "ANAMBRA");
        States bauchI           = new States    ("NE", "BAUCHI");
        States adamaWA          = new States    ("NE", "ADAMAWA");
        States benue            = new States    ("NC", "BENUE");
        States borno            = new States    ("NE", "BORNO");
        States cross_river      = new States    ("SS", "CROSS_RIVER");
        States abuja            = new States    ("NC", "ABUJA");
        States delta            = new States    ("SS", "DELTA");
        States imo              = new States    ("SE", "IMO");
        States kaduna           = new States    ("NW", "KADUNA");
        States kano             = new States    ("NW", "KANO");
        States katsina          = new States    ("NW", "KATSINA");
        States kwara            = new States    ("NC", "KWARA");
        States lagos            = new States    ("SW", "LAGOS");
        States niger            = new States    ("NC", "NIGER");
        States ogun             = new States    ("SW", "OGUN");
        States ondo             = new States    ("SW", "ONDO");
        States oyo              = new States    ("SW", "OYO");
        States plateau          = new States    ("NC", "PLATEAU");
        States rivers           = new States    ("SS", "RIVERS");
        States sokoto           = new States    ("NW", "SOKOTO");
        States abia             = new States    ("SE", "ABIA");
        States edo              = new States    ("SS", "EDO");
        States enugu            = new States    ("SE", "ENUGU");
        States jigawa           = new States    ("NW", "JIGAWA");
        States kebbi            = new States    ("NW", "KEBBI");
        States kogi             = new States    ("NC", "KOGI");
        States osun             = new States    ("SW", "OSUN");
        States taraba           = new States    ("NE", "TARABA");
        States yobe             = new States    ("NE", "YOBE");
        States bayelsa          = new States    ("SS", "BAYELSA");
        States ebonyi           = new States    ("SE", "EBONYI");
        States ekiti            = new States    ("SW", "EKITI");
        States gombe            = new States    ("NE", "GOMBE");
        States nasarawa         = new States    ("NC", "NASARAWA");
        States zamfara          = new States    ("NC", "ZAMFARA");



        List<States> list = new ArrayList<>();
        list.add(akwa_ibom);
        list.add(anambra);
        list.add(bauchI);
        list.add(adamaWA);
        list.add(benue);
        list.add(borno);
        list.add(cross_river);
        list.add(abuja);
        list.add(delta);
        list.add(imo);
        list.add(kaduna);
        list.add(kano);
        list.add(katsina);
        list.add(kwara);
        list.add(lagos);
        list.add(niger);
        list.add(ogun);
        list.add(ondo);
        list.add(oyo);
        list.add(plateau);
        list.add(rivers);
        list.add(sokoto);
        list.add(abia);
        list.add(edo);
        list.add(enugu);
        list.add(jigawa);
        list.add(kebbi);
        list.add(kogi);
        list.add(osun);
        list.add(taraba);
        list.add(yobe);
        list.add(bayelsa);
        list.add(ebonyi);
        list.add(ekiti);
        list.add(gombe);
        list.add(nasarawa);
        list.add(zamfara);


        return list;
    }

    public class States {
        private String region;
        private String statesName;


        public States(String region, String statesName) {
            this.region = region;
            this.statesName = statesName;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getStatesName() {
            return statesName;
        }

        public void setStatesName(String statesName) {
            this.statesName = statesName;
        }
    }
}
