// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/subjectmapping/subject_mapping.proto

// Protobuf Java Version: 3.25.3
package io.opentdf.platform.policy.subjectmapping;

public interface MatchSubjectMappingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:policy.subjectmapping.MatchSubjectMappingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .policy.subjectmapping.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
   */
  java.util.List<io.opentdf.platform.policy.subjectmapping.SubjectProperty> 
      getSubjectPropertiesList();
  /**
   * <code>repeated .policy.subjectmapping.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
   */
  io.opentdf.platform.policy.subjectmapping.SubjectProperty getSubjectProperties(int index);
  /**
   * <code>repeated .policy.subjectmapping.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
   */
  int getSubjectPropertiesCount();
  /**
   * <code>repeated .policy.subjectmapping.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
   */
  java.util.List<? extends io.opentdf.platform.policy.subjectmapping.SubjectPropertyOrBuilder> 
      getSubjectPropertiesOrBuilderList();
  /**
   * <code>repeated .policy.subjectmapping.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
   */
  io.opentdf.platform.policy.subjectmapping.SubjectPropertyOrBuilder getSubjectPropertiesOrBuilder(
      int index);
}