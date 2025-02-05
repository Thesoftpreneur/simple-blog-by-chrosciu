package org.example.cli.action;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Action {
    SHOW_POSTS_TITLES(1, new ShowPostsTitlesCommand(), false),
    SEARCH_POSTS(2, new SearchPostsCommand(), false),
    SHOW_POST_CONTENT(3, new ShowPostContentCommand(), false),
    ADD_POST(4, new AddPostCommand(), false),
    REMOVE_POST(5, new RemovePostCommand(), false),
    EXIT_APPLICATION(0, new ExitApplicationCommand(), false),
    NO_OP(null, new NoOpCommand(), false);

    private final Integer code;
    private final Command command;
    private final boolean terminal;
}
