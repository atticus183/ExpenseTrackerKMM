import SwiftUI
import shared

extension AccountListViewModel: ObservableObject{}

struct AccountListView: View {
    @ObservedObject var viewModel: AccountListViewModel

    init(viewModel: AccountListViewModel = AccountListViewModel(repository: AccountRepositoryImpl())) {
        self.viewModel = viewModel
    }

	var body: some View {
        NavigationView {
            List {
                ForEach(viewModel.accounts, id: \.self) { account in
                    Text(account.name)
                }
            }.navigationTitle("Accounts")
        }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		AccountListView()
	}
}
