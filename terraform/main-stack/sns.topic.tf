resource "aws_sns_topic" "this" {
  name = "send-message_notification"

  tags = {
    Environment = "local"
  }
}