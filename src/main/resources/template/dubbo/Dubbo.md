# ${desc}

**URI:** ${uri}

**Service:** ${name}

**Protocol:** ${protocol}

**Author:** ${author}

**Version:** ${version}
<% for(doc in list){ %>
<%if(doc.deprecated){%>

## ~~${doc.desc}~~

<%}else{%>

## ${doc.desc}

<%}%>

**Definition：** ${doc.methodDefinition}

<%if(isNotEmpty(doc.author)){%>
**Author:** ${doc.author}
<%}%>

**Description:** ${doc.detail}

<%if(isNotEmpty(doc.requestParams)){%>
**Invoke-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---

<% for(param in doc.requestParams){ %>
${param.field}|${param.type}|${param.desc}|${param.required}|${param.version}
<%}%>
<%}%>

<%if(isNotEmpty(doc.responseParams)){%>
**Response-fields:**

Field | Type|Description|Since
---|---|---|---

<% for(param in doc.responseParams){ %>
${param.field}|${param.type}|${param.desc}|${param.version}
<%}%>
<%}%>

<% } %>



