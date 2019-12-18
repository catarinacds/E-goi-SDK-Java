

# Segment

Segment schema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**segmentId** | **String** |  | 
**name** | **String** | Name of the segment |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of segment |  [optional] [readonly]
**segmentFilter** | [**SavedSegmentAllOfSegmentFilter**](SavedSegmentAllOfSegmentFilter.md) |  | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]



## Enum: TypeEnum

Name | Value
---- | -----
TAG | &quot;tag&quot;



