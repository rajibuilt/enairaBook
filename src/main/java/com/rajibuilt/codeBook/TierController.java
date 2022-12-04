package com.rajibuilt.codeBook;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TierController {

    @RequestMapping(value = "tier", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List< Tier> tierList() {
        Tier One = new  Tier("One", "Tier 1");
        Tier Two = new  Tier("Two", "Tier 2");
        Tier Three = new  Tier("Three", "Tier 3");
        Tier Four = new  Tier("Four", "Tier 4");


        List<Tier> list = new ArrayList<>();
        list.add(One);
        list.add(Two);
        list.add(Three);
        list.add(Four);

        return list;
    }

    public class Tier {
        private String code;
        private String description;

        public Tier(String code, String description) {
            this.code = code;
            this.description = description;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
