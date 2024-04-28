package com.example.demo;

import com.app.apply_xslt.ApplyXSLTService;
import com.app.apply_xslt.ExtField;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

@ExtendWith({MockitoExtension.class})
class DemoApplicationTests {

    @Mock
    private ExtField extField;

    @Mock
    private Resource myPdfResource;

    @InjectMocks
    private ApplyXSLTService applyXSLTService;

    @BeforeEach
    void setUp() {
        applyXSLTService=new ApplyXSLTService(extField);
    }

    @Test
    void test() throws IOException {
        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<note>\n" +
                "    <to>sak</to>\n" +
                "    <to>       </to>\n" +
                "    <from>\n" +
                "        <note>\n" +
                "            <to>Tove</to>\n" +
                "            <from/>\n" +
                "            <from    />\n" +
                "            <heading />\n" +
                "            <body>Don't forget me this weekend!</body>\n" +
                "        </note>\n" +
                "    </from>\n" +
                "    <heading/>\n" +
                "    <body>Don't forget me this weekend!</body>\n" +
                "</note>";

        File file = new File("src/main/resources/sak.xslt");
        Mockito.when(extField.getFilePartEmptyArr()).thenReturn(myPdfResource);
        Mockito.when(myPdfResource.getFile()).thenReturn(file);
        StringWriter stringWriter = applyXSLTService.applyXSLT(str);
        Assertions.assertFalse(stringWriter.toString().contains("<from/>"));
    }

}
