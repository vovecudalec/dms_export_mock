package ru.vzuev.mock.web;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Controller {

    StringBuilder stringBuilder = new StringBuilder();

    Logger log = Logger.getLogger(this.getClass());

    @RequestMapping(method = RequestMethod.POST, consumes = "application/xml")
    @ResponseBody
    public IntegrationResponseDTO sayHello(@RequestBody DocumentExportDTO documentExportDTO) {
        log.warn(documentExportDTO);
        stringBuilder.append(documentExportDTO.toString() + '\n');
        stringBuilder.append('\n');
        return new IntegrationResponseDTO("", "", 0, "OK");
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getLog() {

        return stringBuilder.toString();

    }

}
