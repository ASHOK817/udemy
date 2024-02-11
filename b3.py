def countingMinutes(Input_str):
    start_time, end_time = Input_str.split("-")

    def time_to_minutes(time_str):
        hours, minutes = map(int, time_str[:-2].split(":"))
        if time_str.endswith("pm") and hours != 12:
            hours += 12
        elif time_str.endswith("am") and hours == 12:
            hours = 0
        return hours * 60 + minutes

    start_minutes = time_to_minutes(start_time.strip())
    end_minutes = time_to_minutes(end_time.strip())

    if start_minutes <= end_minutes:
        return end_minutes - start_minutes
    else:
        return 24 * 60 - start_minutes + end_minutes

print(countingMinutes("9:00am-10:00am"))
print(countingMinutes("1:00pm-11:00am"))
