package mattwhite180.BinaryForest;


public class Greeting {

  private long id;
  private String content;

  public Greeting() {
    this.id = 0;
    this.content = "default";
  }

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

}