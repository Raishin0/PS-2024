package ps.jmagna.dtos.publication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class PublicationDto {
    Long id;
    String name;
    String description;
    Long userId;
    String username;
    String userIconUrl;
    String type;
    String difficulty;
    int difficultyValue;
    String calification;
    String myCalification;
    String video;
    List<SectionDto> sections;
    boolean canSold;
    BigDecimal price;
    Long count;

}