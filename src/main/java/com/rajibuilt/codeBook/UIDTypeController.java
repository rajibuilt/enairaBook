package com.rajibuilt.codeBook;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UIDTypeController {

        @RequestMapping(value = "UIDType", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
         @ResponseBody
        public List<UIDType> UIDlist() {
            UIDType bvn = new UIDType("BVN", "Bank Verification Number");
            UIDType nin = new UIDType("NIN", "National Identity Number");
            UIDType tin = new UIDType("TIN", "Tax Identification Number");
            UIDType phn = new UIDType("PHN", "Phone Number");
            List<UIDType> list = new ArrayList<>();
            list.add(bvn);
            list.add(nin);
            list.add(tin);
            list.add(phn);

            return list;
        }

        public class UIDType
        {
            private String code;
            private String description;

            public UIDType(String code, String description) {
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
