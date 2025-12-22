resource "aws_dynamodb_table" "this" {
  name         = "message"
  billing_mode = "PAY_PER_REQUEST"

  hash_key  = "message"
  range_key = "message_id"

  attribute {
    name = "message"
    type = "S"
  }

  attribute {
    name = "message_id"
    type = "S"
  }

  tags = {
    Environment = "local"
  }
}