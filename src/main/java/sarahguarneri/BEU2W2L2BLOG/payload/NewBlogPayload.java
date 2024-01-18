package sarahguarneri.BEU2W2L2BLOG.payload;

import lombok.Getter;

@Getter
public class NewBlogPayload {
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int minutiLettura;
    private int blogAuthorId;
}
