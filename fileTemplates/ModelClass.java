#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ${NAME} {
}