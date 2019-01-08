#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

@Api
@Log4j
@RestController
@RequestMapping("")
public class ${NAME} {
}