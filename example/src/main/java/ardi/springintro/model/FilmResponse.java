package ardi.springintro.model;

public class FilmResponse {
  String title;
  int episode_id;

  public FilmResponse() {
  }

  public FilmResponse(String title, int episode_id) {
    this.title = title;
    this.episode_id = episode_id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getEpisode_id() {
    return episode_id;
  }

  public void setEpisode_id(int episode_id) {
    this.episode_id = episode_id;
  }
}
