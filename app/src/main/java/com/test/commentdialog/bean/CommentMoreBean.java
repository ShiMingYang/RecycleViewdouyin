package com.test.commentdialog.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import static com.test.commentdialog.bean.CommentEntity.TYPE_COMMENT_MORE;

/**
 */
public class CommentMoreBean implements MultiItemEntity {

    private long totalCount;
    private long position;
    private long positionCount;

    @Override
    public int getItemType() {
        return TYPE_COMMENT_MORE;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    public long getPositionCount() {
        return positionCount;
    }

    public void setPositionCount(long positionCount) {
        this.positionCount = positionCount;
    }
}
