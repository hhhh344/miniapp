// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: jump.proto

package com.huya.ig.jump.protocol;

public interface JumpCmdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pb.JumpCmd)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 起跳站台
   * </pre>
   *
   * <code>.pb.Position from = 1;</code>
   */
  boolean hasFrom();
  /**
   * <pre>
   * 起跳站台
   * </pre>
   *
   * <code>.pb.Position from = 1;</code>
   */
  com.huya.ig.jump.protocol.Position getFrom();
  /**
   * <pre>
   * 起跳站台
   * </pre>
   *
   * <code>.pb.Position from = 1;</code>
   */
  com.huya.ig.jump.protocol.PositionOrBuilder getFromOrBuilder();

  /**
   * <pre>
   * 抵达站台
   * </pre>
   *
   * <code>.pb.Position to = 2;</code>
   */
  boolean hasTo();
  /**
   * <pre>
   * 抵达站台
   * </pre>
   *
   * <code>.pb.Position to = 2;</code>
   */
  com.huya.ig.jump.protocol.Position getTo();
  /**
   * <pre>
   * 抵达站台
   * </pre>
   *
   * <code>.pb.Position to = 2;</code>
   */
  com.huya.ig.jump.protocol.PositionOrBuilder getToOrBuilder();
}
