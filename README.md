Coding what I found here
https://www.facebook.com/groups/184139591763145/permalink/1432065043637254/

Notes:
---My question and my goal was whether I could add objects that had no reference name.  
---I accomplished that, but still confused about usefulness of having objects with no reference name as in varName below
---List<T> varName = new ArrayList<T>();



 I'd create a new class that hold user information such as username & password.
Then create a List parses that class like this...
private List<Users> userList = new ArrayList<>();
and then when adding I'd do..
userList.add(new User(usernameInput, passwordInput));
and then
for (int i = 0; i < userList.size(); i++) {
if (inputname.equals(userList.get(i).getUsername()) && inputpass.equals(userList.get(i).getPassword()) {
sout("Welcome user #"+ i +"");
}
}
Something along the lines of this.
Hide or report this
Like
 · Reply · 9h
Bull Bull
Bull Bull Micheal Thompson Noted. Thanks
Hide or report this
Like
 · Reply · 9h
Micheal Thompson
Micheal Thompson Plenty of better ways for doing things like this but for what you need that will suffice.
I'd look into iterators though if you plan on actually doing anything with this.
https://docs.oracle.com/.../docs/api/java/util/Iterator.html
As loops aren't actually intended for iterating pulling and updating information within a List concurrently