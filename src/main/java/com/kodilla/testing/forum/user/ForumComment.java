package com.kodilla.testing.forum.user;

public class ForumComment {

    private ForumPost forumPost;
    private String commentBody;
    private String author;

    public ForumComment(ForumPost forumPost, String commentBody, String author) {
        this.forumPost = forumPost;
        this.commentBody = commentBody;
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }


    public ForumPost getForumPost() {
        return forumPost;
    }


    public String getCommentBody() {
        return commentBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumComment)) return false;

        ForumComment that = (ForumComment) o;

        if (!forumPost.equals(that.forumPost)) return false;
        if (!commentBody.equals(that.commentBody)) return false;
        return author.equals(that.author);
    }

    @Override
    public int hashCode() {
        int result = forumPost.hashCode();
        result = 31 * result + commentBody.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}