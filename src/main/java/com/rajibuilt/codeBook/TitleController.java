package com.rajibuilt.codeBook;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TitleController {

    @RequestMapping(value = "title", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Title> titleList() {
        Title chf = new Title("CHF", "Chief");
        Title dr = new Title("DR", "Doctor");
        Title miss = new Title("MISS", "Misses");
        Title mr = new Title("MR", "Mister");
        Title prf = new Title("PRF", "Proffesor");

        List<Title> list = new ArrayList<>();
        list.add(chf);
        list.add(dr);
        list.add(miss);
        list.add(mr);
        list.add(prf);

        return list;
    }

    public class Title
    {
        private String code;
        private String description;

        public Title(String code, String description) {
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
