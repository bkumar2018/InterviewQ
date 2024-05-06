package InterviewQ.ReadJson;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonString {


 public static void main(String[] args) throws ParseException {

   String target_str = "{\"targets\":[{\"count(*)\":\"0\"}]}";
   System.out.println(target_str.toString());

   JSONParser parser = new JSONParser();
   Object json = parser.parse(target_str);
   JSONObject jsonObject = (JSONObject)json;

   JSONArray targetsJsonArr = (JSONArray)jsonObject.get("targets");

   JSONObject jsonObjectCnt = (JSONObject)targetsJsonArr.get(0);

   System.out.println(jsonObjectCnt.get("count(*)"));

     pushOrderJsonArr();
 }


    public static void pushOrderJsonArr() throws ParseException {
        String target_Str = "{\r\n"
                + " \"routingDetail\": {\r\n"
                + " \"sourceSystemName\": {\r\n"
                + " \"extSystemName\": \"AOS\"\r\n"
                + " },\r\n"
                + " \"targetSystemName\": {\r\n"
                + " \"extSystemName\": \"Adserver\"\r\n"
                + " }\r\n"
                + " },\r\n"
                + " \"callBackUrl\": \"<callbackUrl>\",\r\n"
                + " \"files\": [\r\n"
                + " {\r\n"
                + " \"s3SourceDetail\": {\r\n"
                + " \"s3Bucket\": \"aosdev-ext\",\r\n"
                + " \"s3Folder\": \"aos_adserver_request/devfox/Push/24-06-2021/create\",\r\n"
                + " \"s3File\": \"PushOrder_ExcludeTargetDevTest1042.json\",\r\n"
                + " \"region\": \"us-east-1\"\r\n"
                + " },\r\n"
                + " \"entityDetail\": {\r\n"
                + " \"entityType\": \"PushOrder\",\r\n"
                + " \"entitySource\": \"s3\"\r\n"
                + " },\r\n"
                + " \"schemaDetail\": {\r\n"
                + " \"schemaName\": null,\r\n"
                + " \"keySchema\": null,\r\n"
                + " \"valueSchema\": null,\r\n"
                + " \"keyFields\": null\r\n"
                + " }\r\n"
                + " },\r\n"
                + " {\r\n"
                + " \"s3SourceDetail\": {\r\n"
                + " \"s3Bucket\": \"aosdev-ext\",\r\n"
                + " \"s3Folder\": \"aos_adserver_request/devfox/Push/24-06-2021/create\",\r\n"
                + " \"s3File\": \"PushOrderLineItem_ExcludeTargetDevTest1042.json\",\r\n"
                + " \"region\": \"us-east-1\"\r\n"
                + " },\r\n"
                + " \"entityDetail\": {\r\n"
                + " \"entityType\": \"PushOrderLineItem\",\r\n"
                + " \"entitySource\": \"s3\"\r\n"
                + " },\r\n"
                + " \"schemaDetail\": {\r\n"
                + " \"schemaName\": null,\r\n"
                + " \"keySchema\": null,\r\n"
                + " \"valueSchema\": null,\r\n"
                + " \"keyFields\": null\r\n"
                + " }\r\n"
                + " }\r\n"
                + " ],\r\n"
                + " \"metaDataObject\": {\r\n"
                + " \"orderId\": \"61496980bec3bb075388aadbexcludeTarget36\",\r\n"
                + " \"lineIds\": [\r\n"
                + " \"6151867f925ad8410b2ddc9bexcludeTarget36\"\r\n"
                + " ]\r\n"
                + " }\r\n"
                + "}";

        System.out.println(target_Str);
        JSONParser parser = new JSONParser();
        Object json = parser.parse(target_Str);
        JSONObject jsonObject = (JSONObject)json;

        JSONArray filesJsonArr = (JSONArray)jsonObject.get("files");

        JSONObject jsonObjectsFiles = (JSONObject)filesJsonArr.get(0);
        JSONObject jsonObjects3SourceDetail = (JSONObject) jsonObjectsFiles.get("s3SourceDetail");

        String s3FileName = (String) jsonObjects3SourceDetail.get("s3File");
        System.out.println(s3FileName);
        jsonObjects3SourceDetail.put("s3File", "dummyDatafile");

        String payload = jsonObject.toJSONString();
        System.out.println(payload);

// Object payloadJson = parser.parse(payloadStr);
// JSONObject jsonObjectPayload = (JSONObject) payloadJson;
// jsonObjectPayload.put("productionSystemId",productionSystemId);
//
//System.out.println(jsonObjects3SourceDetail.get("s3File"));


// JSONObject entityDetailHeader = (JSONObject) jsonObject.get("entityDetail");
// entityDetailHeader.put("entityType", entityTypeName);


    }

}



/*

{
  "routingDetail": {
    "sourceSystemName": {
      "extSystemName": "AOS"
    },
    "targetSystemName": {
      "extSystemName": "Adserver"
    }
  },
  "callBackUrl": "<callbackUrl>",
  "files": [
    {
      "s3SourceDetail": {
        "s3Bucket": "aosdev-ext",
        "s3Folder": "aos_adserver_request/devfox/Push/24-06-2021/create",
        "s3File": "PushOrder_ExcludeTargetDevTest1042.json",
        "region": "us-east-1"
      },
      "entityDetail": {
        "entityType": "PushOrder",
        "entitySource": "s3"
      },
      "schemaDetail": {
        "schemaName": null,
        "keySchema": null,
        "valueSchema": null,
        "keyFields": null
      }
    },
    {
      "s3SourceDetail": {
        "s3Bucket": "aosdev-ext",
        "s3Folder": "aos_adserver_request/devfox/Push/24-06-2021/create",
        "s3File": "PushOrderLineItem_ExcludeTargetDevTest1042.json",
        "region": "us-east-1"
      },
      "entityDetail": {
        "entityType": "PushOrderLineItem",
        "entitySource": "s3"
      },
      "schemaDetail": {
        "schemaName": null,
        "keySchema": null,
        "valueSchema": null,
        "keyFields": null
      }
    }
  ],
  "metaDataObject": {
    "orderId": "61496980bec3bb075388aadbexcludeTarget36",
    "lineIds": [
      "6151867f925ad8410b2ddc9bexcludeTarget36"
    ]
  }
}

 */


/*

{
  "callBackUrl": "<callbackUrl>",
  "routingDetail": {
    "targetSystemName": {
      "extSystemName": "Adserver"
    },
    "sourceSystemName": {
      "extSystemName": "AOS"
    }
  },
  "files": [
    {
      "entityDetail": {
        "entityType": "PushOrder",
        "entitySource": "s3"
      },
      "s3SourceDetail": {
        "s3File": "dummyDatafile",
        "s3Folder": "aos_adserver_request/devfox/Push/24-06-2021/create",
        "region": "us-east-1",
        "s3Bucket": "aosdev-ext"
      },
      "schemaDetail": {
        "valueSchema": null,
        "keyFields": null,
        "keySchema": null,
        "schemaName": null
      }
    },
    {
      "entityDetail": {
        "entityType": "PushOrderLineItem",
        "entitySource": "s3"
      },
      "s3SourceDetail": {
        "s3File": "PushOrderLineItem_ExcludeTargetDevTest1042.json",
        "s3Folder": "aos_adserver_request/devfox/Push/24-06-2021/create",
        "region": "us-east-1",
        "s3Bucket": "aosdev-ext"
      },
      "schemaDetail": {
        "valueSchema": null,
        "keyFields": null,
        "keySchema": null,
        "schemaName": null
      }
    }
  ],
  "metaDataObject": {
    "orderId": "61496980bec3bb075388aadbexcludeTarget36",
    "lineIds": [
      "6151867f925ad8410b2ddc9bexcludeTarget36"
    ]
  }
}
 */