# Collections (MongoDB)

## Task

```json
{
    "_id": "string",
    "title": "string",
    "description": "string",
    "status": "string",
    "isFavorite": "boolean",
    "priority": "string",
    "creationDate": "dateTime",
    "startDate": "dateTime",
    "endDate": "dateTime"
}

```

### Request Example

```json
{
  "title": "Task 0",
  "description": "Test",
  "status": "Pending",
  "isFavorite": true,
  "priority": "High",
  "creationDate": "2025-08-12T10:30:00Z",
  "startDate": "2025-08-12T10:30:00",
  "endDate": "2025-08-13T10:30:00"
}
```